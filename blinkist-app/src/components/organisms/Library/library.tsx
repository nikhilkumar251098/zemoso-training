import React, { SetStateAction, useContext, useEffect, useState } from "react";
import { Container, Grid, Box, Tabs, Tab } from "@mui/material";
import data from "../../../assets/data/data.json";
import TypographyComponent from "../../atoms/Typography/typography";
import { styled } from "@mui/system";
import BookCard from "../../organisms/BookCard/bookcard";
import statusContext from "../../../assets/context/statusContext";
import nameContext from "../../../assets/context/nameContext";
import axios from "axios";
import {fetchBooks} from "../../../api/fetchbooks";

const RootContainer = styled(Container)({
  display: "flex",
  flexDirection: "column",
  alignItems: "flex-start",
});

interface TabPanelProps {
  children?: React.ReactNode;
  index: number;
  value: number;
}

interface StateProps {
  id:string;
  img?: string;
  bookName?: string;
  bookAuthor?: string;
  time?: string;
  reads?: string;
  status: string;
  // type?: string;
}

function TabPanel(props: TabPanelProps) {
  const { children, value, index, ...other } = props;
  
  return (
    <div
      role="tabpanel"
      hidden={value !== index}
      id={`simple-tabpanel-${index}`}
      aria-labelledby={`simple-tab-${index}`}
      {...other}
      style={{width:"100%",display: 'flex', justifyContent: 'flex-start'}}
    >
      {value === index && (
        <Box sx={{ p: 3, paddingLeft: '0px' }}>
          {/* <Typography>{children}</Typography> */}
          {children}
        </Box>
      )}
    </div>
  );
}

function allyProps(index: number) {
  return {
    id: `simple-tab-${index}`,
    'aria-controls': `simple-tabpanel-${index}`,
  };
}



const Library = () => {
  const { status, setStatus } = useContext(statusContext);
  const { name } = useContext(nameContext);
  const [value, setValue] = useState<number>(0)
  const handleChange = (event: React.SyntheticEvent, newValue: number) => {
    setValue(newValue);
  };

  // const [books, setBooks] = useState<StateProps[]>([])

  // const getBooks=async () => {
  //   const { data } = await axios.get(`http://localhost:3005/books`)
  //    return data;
  // }
 
  // useEffect(() => { 

  //   getBooks().then(response => {
  //   setBooks(response);
     
  //   })

  //   // console.log('res = ', res);
  // console.log("books=",books)
  // }, [value])

  return (
    <RootContainer data-testid="library">
      <Box sx={{ width: "95%", ml: 4 }}>
        <TypographyComponent
          variant="h1"
          children="My Library"
          color="textColors.highEmphasis"
        />
        <Box mt={6} sx={{ borderBottom: "2px solid #F1F6F4", width: "100%", zIndex: 0 }} >
          <Tabs value={value} onChange={handleChange} sx={{ zIndex: 1 }}>
            <Tab
            {...allyProps(0)}
              label={
                <Box sx={{ width: "100%" }}>
                  <TypographyComponent variant="subtitle2" children="Currently reading" />
                </Box>
              }
              sx={{ width: "25vw", textTransform: "none", borderBottom: "2px solid #E1ECFC" }}
              onClick={() => setStatus("reading")}
            />
            <Tab
             {...allyProps(1)}
              label={
                <Box sx={{ width: "100%" }}>
                  <TypographyComponent width="10px" variant="subtitle2" children="Finished"/>
                </Box>
              }
              sx={{ width: "25vw", textTransform: "none",borderBottom: "2px solid #E1ECFC", }}
              onClick={() => setStatus("finished")}
            />
          </Tabs>
        </Box>
  
        <Grid container mt={1} sx={{margin: 'auto'}} spacing={6}>
          <TabPanel index={0} value={value} > 
            <BookCard status="reading" showFinished= {true}  />
          </TabPanel>
        </Grid>
        <Grid container mt={1} sx={{margin: 'auto'}} spacing={6}>
            <TabPanel index={1} value={value}>
                <BookCard status="finished" showReadAgain= {true}  />
            </TabPanel>
          </Grid>
      </Box>
    </RootContainer>
  );
};

export default Library;
