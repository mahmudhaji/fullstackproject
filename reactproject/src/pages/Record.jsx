import React, { PureComponent } from 'react'
import Home from '../component/Home'
import './Record.css'

export default class Record extends PureComponent {
  render() {
    return (
      <div>

      <Home/>  
      <h1>Cases Record</h1>
      <table>
  <tr>
    <th>fullName</th>
    <th>Gender</th>
    <th>Age</th>
    <th>licenceNumber</th>
    <th>Location</th>
    <th>CasesName</th>
    <th>CasesDade</th>
  </tr>
  
</table>
      </div>
    )
  }
}
