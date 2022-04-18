import React, { useEffect } from "react";
import "./Home.scss";
import { getStatisticAPI } from "../../api/exam";
import TestButton from "../../components/Button/TestButton";
import { styled } from "@mui/material/styles";
import Box from "@mui/material/Box";
import Paper from "@mui/material/Paper";
import Grid from "@mui/material/Grid";
import InfoBox from "../../components/InfoBox";
import SearchTestInput from "../../components/Input/SearchTestInput";

const Item = styled(Paper)(({ theme }) => ({
  backgroundColor: theme.palette.mode === "dark" ? "#1A2027" : "#fff",
  ...theme.typography.body2,
  padding: theme.spacing(1),
  textAlign: "center",
  color: theme.palette.text.secondary,
}));

function Home(props) {
  useEffect(() => {
    (async () => {
      const statisticInfo = await getStatisticAPI();
      console.log("Statistic info: ", statisticInfo);
    })();
  }, []);

  return (
    <div>
      <div className="home-background_image">
        <div style={{ paddingTop: "210px" }}>
          <div
            style={{
              display: "flex",
              justifyContent: "space-between",
              zIndex: "1",
            }}
          >
            <div className="home-background1"></div>
            <div className="home-background2"></div>
          </div>
          <div className="home-background">
            <span className="home-title">Trắc nghiệm y khoa số 2 Việt Nam</span>
            <TestButton />
          </div>
        </div>
      </div>

      <Box sx={{ margin: "40px 200px" }}>
        <Grid container spacing={2}>
          <Grid item xs={6}>
            <div>
              <SearchTestInput />
            </div>
          </Grid>
          <Grid item xs={2}>
            <InfoBox number={30} text="Môn thi" />
          </Grid>
          <Grid item xs={2}>
            <InfoBox number={2274} text="Câu hỏi" />
          </Grid>
          <Grid item xs={2}>
          <InfoBox number={487} text="Thành viên"/>
          </Grid>
        </Grid>
      </Box>
    </div>
  );
}

export default Home;
