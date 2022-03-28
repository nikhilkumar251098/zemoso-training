import { createContext } from "react";

const nameContext = createContext({
  name: "",
  setName: (newName: string) => {
  //This is intentional
  },
});

export default nameContext;
