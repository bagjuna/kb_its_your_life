<script setup>
import { reactive, ref } from 'vue'
import axios from 'axios'
// const requestAPI = () => {
//   const url = 'http://localhost:3000/api/todos/2'
//   axios.get(url).then((response) => {
//     console.log('# 응답 객체 : ', response)
//     temp.id = response.id
//     temp.todo = response.todo
//     temp.desc = response.desc
//     temp.done = response.done
//   })
// }

const requestAPI = () => {
  const url = 'api/todos/2'
  axios.get(url).then((response) => {
    console.log('# 응답 객체 : ', response)
    temp = response.data
  })
}

const temp = reactive({
  id: '4',
  todo: 'Socket 공부',
  desc: 'Socket 공부 해야합니다.',
  done: false,
})
requestAPI()
</script>

<template>
  <main>
    안녕
    {{ temp }}
  </main>
</template>
