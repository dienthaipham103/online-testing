import "./App.scss";
import Footer from "./Footer";
import Header from "./Header";
import { Route, Routes } from "react-router-dom";
import Home from "../pages/Home";
import Account from "../pages/Account";

function App() {
  return (
    <div className="App">
      <Header />
      <Routes>
        <Route path="/" element={<Home />}/>
        <Route path="/account" element={<Account />}/>
      </Routes>
      <Footer />
    </div>
  );
}

export default App;
