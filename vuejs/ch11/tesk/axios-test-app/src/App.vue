<script setup>
import axios from 'axios'

const listUrl = "/api/todos";
const todoUUrlPrefix = "/api/todo/";

const requestAPI = () =>{
  axios.get(listUrl)
  .then((response) => {
    console.log(response.data);
  })
  .catch((error) => {
    console.error(error);
  });
}
</script>

<template>
  <div>
    <h2>콘솔을 확인합니다.</h2>
  </div>
</template>

