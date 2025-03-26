<script>

import InputTodo from "./components/InputTodo.vue";
import TodoList from "./components/TodoList.vue";

let ts = new Date().getTime();

export default {
  name: "App",
  components: {InputTodo, TodoList},
  data() {
    return {
      todoList: [
        {id: ts, title: "자전거 타기", completed: false},
        {id: ts + 1, title: "딸과 공원 산책", completed: false},
        {id: ts + 2, title: "마트 장보기", completed: false},
        {id: ts + 3, title: "Vue.js 학습", completed: false},
      ]
    }
  }
}

</script>


<template>
  <div id="app" class="container">
    <div class="card card-body bg-light">
      <div classe="title">:: Todolist App</div>
    </div>
    <div class="card card-default card-borderless">
      <div class="card-body">
        <InputTodo/>
        <TodoList :todoList="todoList"/>
      </div>
    </div>
  </div>
</template>