import React from "react";
import Button from "@mui/material/Button";
import { makeStyles } from "@mui/styles";
import KeyboardDoubleArrowRightIcon from "@mui/icons-material/KeyboardDoubleArrowRight";

const useStyles = makeStyles({
  root: {
    border: 0,
    boxShadow: "0 3px 5px 2px rgba(255, 105, 135, .3)",
    color: "white",
    height: 60,
    "&.MuiButton-root": {
      padding: "0 40px",
      backgroundColor: "#e4bc36",
      textTransform: "none",
      borderRadius: "0",
      "&:hover": {
        textDecoration: "underline",
        backgroundColor: "#8daca6",
      },
    },
  },
});

function TestButton(props) {
  const classes = useStyles();

  return (
    <Button variant="contained" className={classes.root}>
      Thi đi chờ chi
      <KeyboardDoubleArrowRightIcon />
    </Button>
  );
}

export default TestButton;
