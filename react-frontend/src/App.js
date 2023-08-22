import logo from './logo.svg';
import './App.css';
import EmployeeComponent from './component/EmployeeComponent';

{/* <div className="App"> 
To fill spaces on sides

Göra header visible för svart bakgrund*/
}
function App() {
  return (
    <div className="container">
     {/*<header className="App-header">*/} 
     <br/> 
    {/*<h1 className='text-center'>📁 Human Resources Management System</h1>*/}
    <EmployeeComponent/>
      {/*</header>*/}
    </div>
  );
}

export default App;
