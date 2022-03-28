import "./App.css";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import LibraryPage from "./pages/LibraryPage/librarypage";
import { useState } from "react";
import statusContext from "./assets/context/statusContext";
import nameContext from "./assets/context/nameContext";
import Footer from "./components/molecules/Footer/footer";
import Header from "./components/organisms/Header/header";
import Library from "./components/organisms/Library/library";
import EnterpreneurshipPage from "./pages/EnterpreneurshipPage/enterpreneurshipage";
import BookDetailViewPage from "./pages/BookDetailViewPage/bookdetailviewpage";

function App() {
  const [status, setStatus] = useState("reading");
  const [name, setName] = useState("");
  console.log(setName);

  return (
    <statusContext.Provider value={{ status, setStatus }}>
      <nameContext.Provider value={{ name, setName }}>
        <Router>
          <div className="App" data-testid="app">
          <Routes>
            <Route path="/" element={<LibraryPage />} />
            <Route path="/selected" element={<EnterpreneurshipPage />} />
            <Route path="/detail/:id" element={<BookDetailViewPage />} />

          </Routes>
          </div>
        </Router>
      </nameContext.Provider>
    </statusContext.Provider>
  );
}

export default App;

