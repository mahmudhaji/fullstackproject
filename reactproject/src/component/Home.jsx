import React from 'react';
import './home.css';
import { Link } from 'react-router-dom';

function Home() {
    
  return (
    <div>
    <body>

    <ul>
      <li><a class="active" href="home">Home</a></li>
      <li><Link to={'/new'} >New Record</Link></li>
      <li><Link to={'/record'} >Record</Link></li>
    
      <li><a href="#about">Logout</a></li>
    </ul>
    </body>
    </div>
  )
}

export default Home
