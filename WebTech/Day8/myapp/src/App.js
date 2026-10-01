// import logo from './logo.svg';
import './App.css';
import ClassComp from './component/ClassComp';
import ConditionalRenComp from './component/ConditionalRenComp';
import FunCom from './component/FunCom';
import GreetingComp from './component/GreetingComp';
import MyCarouselComp from './component/MyCarouselComp';
import MyImagesComp from './component/MyImagesComp';
import MyListClassComp from './component/MyListClassComp';
import ParentClassComp from './component/ParentClassComp';
import StateComp from './component/StateComp';
import MultipleImgComp from './task/MultipleImgComp';
import MyCountComp from './task/MyCountComp';
import MyDetailsCom from './task/MyDetailsComp';
import MyFriendDetailsComp from'./task/MyFriendDetailsComp'
import MyTableClassComp from './task/MyTableClassComp';
import ToggleComp from './task/ToggleComp';

function App() {
  return (
    <div className="App">
      {/* <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header> */}

        <h1>Welcome to react project</h1>
        {/* <FunCom fname="Ajinkya" lname="Raut" pin={696969}/>
        <ClassComp pname="Lapi" pcom="Lenovo" pprice={60000} />
        <MyDetailsCom name="Scientist" contact={6485964} gender="Male" address="barabati,cuttak"/>
        <MyFriendDetailsComp name="Paras" contact={5656} gender="Male" address="Guwahati,Assam" />
        <GreetingComp/> */}
        {/* <StateComp/> */}
        {/* <MyCountComp/> */}
        {/* <ParentClassComp/> */}
        {/* <ConditionalRenComp/> */}
          {/* <MyImagesComp/> */}
          {/* <MyListClassComp/> */}
          {/* <MyTableClassComp/>
          <MyCarouselComp/> */}
          {/* <ToggleComp/> */}
          <MultipleImgComp/>


    </div>
  );
}

export default App;
