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

    render() {
        return (
            <div>
                
            </div>
        );
    }
}

export default EmployeeComponent;