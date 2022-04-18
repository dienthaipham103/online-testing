import axiosClient from "./axiosClient";

export const getStatisticAPI = () => {
    const result = {
        data: {
            subjectsNumber: 3,
            questionsNumber: 2504,
            studentsNumber: 403  
        },
        status: 200
    }
    return new Promise(resolve => setTimeout(() => resolve(result), 1000));
  };