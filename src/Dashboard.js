import React, { useEffect } from "react";
import axios from "axios";
import { useState } from "react";
import "./Dashboard.css";


function Dashboard() {
    const [addressbooks, setAddressBookInfo] = useState([]);
   const [name, setName] = useState("");
    const [email, setEmail] = useState("");
    const [address, setAddress] = useState("");
    const [phoneNumber, setPhoneNumber] = useState("");

  
    useEffect(() => {
      fetchAddressBookInfo();
    }, []);
  
    function fetchAddressBookInfo() {
      axios.get("http://localhost:8080/api/addressbook").then((res) => {
        setAddressBookInfo(res.data);
      });
    }
  
    function addAddressBookInfo() {
      const addressbookData = { name: name, email: email,address: address,phoneNumber:phoneNumber };
      axios.post("http://localhost:8080/api/addressbook", addressbookData).then(() => {
        fetchAddressBookInfo();
        setName("");
        setEmail("");
        setAddress("");
        setPhoneNumber("");
      });
    }

  
    return (
        <div>
            <div className="form-container">
        <h1>Enter Contact Information</h1>
        <form>
          <div className="form-row">
            <div className="form-group">
              <label>Name:</label>
              <input
                type="text"
                placeholder="Enter name"
                value={name}
                onChange={(e) => setName(e.target.value)}
              />
            </div>
            <div className="form-group">
              <label>Email:</label>
              <input
                type="email"
                placeholder="Enter email"
                value={email}
                onChange={(e) => setEmail(e.target.value)}
              />
            </div>
          </div>

          <div className="form-row">
            <div className="form-group">
              <label>Address:</label>
              <input
                type="text"
                placeholder="Enter address"
                value={address}
                onChange={(e) => setAddress(e.target.value)}
              />
            </div>
            <div className="form-group">
              <label>Phone Number:</label>
              <input
                type="number"
                placeholder="Enter phone"
                value={phoneNumber}
                onChange={(e) => setPhoneNumber(e.target.value)}
              />
            </div>
          </div>

    <div className="button-group">
      <button type="button" onClick={addAddressBookInfo}>
        Add Info
      </button>
      <button type="reset">Reset</button>
    </div>
  </form>
</div>

        
        <div  class="container">
            <h1>Contact Information</h1>
          <table>
            <thead>
              <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Phone No</th>
                <th>Email</th>
                <th>Address</th>
              </tr>
            </thead>
            <tbody>
              {addressbooks.map((address) => (
                <tr key={address.id}>
                  <td>{address.id}</td>
                  <td>{address.name}</td>
                  <td>{address.phoneNumber}</td>
                  <td>{address.email}</td>
                  <td>{address.address}</td>
                </tr>
              ))}
            </tbody>
          </table>
        </div>
      </div>
      
    );
  }
export default Dashboard;
