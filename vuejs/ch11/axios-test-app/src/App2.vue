<template>
  <div></div>
</template>

<script setup>
import { reactive } from 'vue'
import axios from 'axios'

const requestAPI = async () => {
  let todoList
  let listUrl
  let todoUrlPrefix
  let response = await axios.get(listUrl)
  todoList = response.data
  console.log('# TodoList : ', todoList)
  for (let i = 0; i < todoList.length; i++) {
    response = await axios.get(todoUrlPrefix + todoList[i].id)
    console.log(`# ${i + 1}번째 Todo : `, response.data)
  }
}

requestAPI()
</script>

<style scoped></style>
