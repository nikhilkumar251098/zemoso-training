import { createContext } from "react";

const statusContext = createContext({
  status: "reading",
  setStatus: (status: string) => {
    //This is intentional
  },
});

export default statusContext;
