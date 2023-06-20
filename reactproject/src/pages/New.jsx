import React, { PureComponent } from 'react'
import Home from '../component/Home'

export default class  extends PureComponent {
  render() {
    return (
      <div>
        

      <Home />
      <div id="New Record">
        <h1>New Record</h1>
        <form action="recorded-information.html" method="post">
          <input id="fullName" type="text" name="fullName" placeholder="Full Name"/>
          <input id="age" type="number" name="age" placeholder="Age"/>
          <input id="carName" type="text" name="carName" placeholder="Car Name"/>
          <input id="licenceNumber" type="text" name="licenceNumber" placeholder="Licence Number"/>
          <input id="Location" type="text" name="location" placeholder="Location"/>
          <input id="caseName" type="text" name="caseName" placeholder="Case Name"/> 
          <br/>
          <button>submit</button>
        </form>
      </div>
      </div>
    )
  }
}
