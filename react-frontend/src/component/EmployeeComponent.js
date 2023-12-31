import React, { Component } from 'react';
import EmployeeService from '../service/EmployeeService';

// Fetches employee, department, and organization data from 
// service when it mounts and stores the data in its state

class EmployeeComponent extends Component {
    
    constructor(props) {
        super(props);

        this.state = {
            employee: {},
            department: {},
            organization: {}
        }
    }

    componentDidMount(){
        EmployeeService.getEmployee().then((response) => {
            this.setState({employee : response.data.employee})
            this.setState({department : response.data.department})
            this.setState({organization : response.data.organization})
        })
    }
//<div className='card col-md-6 offset-md-3 mb-4'>

    render() {
        return (
        
            <div className='bg-light'> 
             <br/>
             <div className='p-30 border-dark' style={{ backgroundColor: 'lightgrey'}}>
             <h1 className='text-center p-4 border-dark shadow-sm' >Human Resources Management System &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ☰</h1>
             {/*📁 &nbsp <br/><br/>*/}
             </div> 
             <br/>
             <div className='shadow-sm border-dark ' >
                <div className='p-4 card col-md-6 offset-md-3 mb-2 shadow-lg bg-light' >

                <h3 className='text-center card-header shadow-sm' style={{ backgroundColor: 'lightblue' }} >Employee Details</h3>
                
                <div className='card-body shadow-sm'>
                    <div className='row'>
                    <p><strong>Employee First Name: </strong>{this.state.employee.firstName}</p>
                    </div>
                    <div className='row'>
                    <p><strong>Employee Last Name: </strong>{this.state.employee.lastName}</p>
                    </div>
                    <div className='row'>
                    <p><strong>Employee Email: </strong>{this.state.employee.email}</p>
                    </div>
                </div>

                <h3 className='text-center card-header shadow-sm' style={{ backgroundColor: 'lightblue' }}>Department Details</h3>
                <div className='card-body shadow-sm'>
                <div className='row'>
                <p><strong>Department Name: </strong>{this.state.department.departmentName}</p>
                </div>
                <div className='row'>
                <p><strong>Department Description: </strong>{this.state.department.departmentDescription}</p>
                </div>
                <div className='row'>
                <p><strong>Department Code: </strong>{this.state.department.departmentCode}</p>
                </div>
                </div>
               

                <h3 className='text-center card-header shadow-sm' style={{ backgroundColor: 'lightblue' }}>Organization Details</h3>
                <div className='card-body shadow-sm'>
                <div className='row'>
                    <p><strong>Organization Name: </strong>{this.state.organization.organizationName}</p>
                </div>
                <div className='row'>
                <p><strong>Organization Description: </strong>{this.state.organization.organizationDescription}</p>
                </div>
                <div className='row'>
                <p><strong>Organization Code: </strong>{this.state.organization.organizationCode}</p>
                 </div>
                 </div>

                 </div>
    
                </div>
            </div>
        );
    }
}

export default EmployeeComponent;