import React from "react";
import office1 from "./images/office1.jpg";
import office2 from "./images/office2.jpg";

function App() {

  const offices = [
    {
      id: 1,
      name: "Regus Business Center",
      rent: 55000,
      address: "Hyderabad",
      image: office1,
    },
    {
      id: 2,
      name: "SmartWorks",
      rent: 75000,
      address: "Bangalore",
      image: office2,
    },
    {
      id: 3,
      name: "WeWork",
      rent: 62000,
      address: "Chennai",
      image: office1,
    },
  ];

  return (
    <div style={{ margin: "20px" }}>

      <h1>Office Space Rental App</h1>

      {offices.map((office) => (

        <div
          key={office.id}
          style={{
            border: "1px solid black",
            width: "350px",
            padding: "15px",
            marginBottom: "20px",
            borderRadius: "10px",
          }}
        >

          <img
            src={office.image}
            alt={office.name}
            width="300"
            height="180"
          />

          <h2>{office.name}</h2>

          <p>
            <b>Address:</b> {office.address}
          </p>

          <p
            style={{
              color: office.rent < 60000 ? "red" : "green",
              fontWeight: "bold",
            }}
          >
            Rent: ₹{office.rent}
          </p>

        </div>

      ))}

    </div>
  );
}

export default App;