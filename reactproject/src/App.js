import React from 'react';
import './App.css';
import Home from './component/Home';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import New from './pages/New';
import Record from './pages/Record';


function App() {
     
    return ( 

        <BrowserRouter>
            <Routes>
                <Route path='/' element={<Home/>}/>
                <Route path='/new' element={<New/>}/>
                <Route path='/record' element={<Record/>}/>
            </Routes>
        </BrowserRouter>
        
        
    );
}

export default App;