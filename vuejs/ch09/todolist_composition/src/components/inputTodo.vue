<template>
  <div class="row">
    <div class="col">
      <input type="text" class="form-control" v-model.trim="todo" @keyup.enter="addTodoHandler"/>
    </div>
    <div class="col-auto">
      <button class="btn btn-primary" @click="addTodoHandler">Add</button>
    </div>
  </div>
</template>

<script setup>

import {ref, reactive} from 'vue';

const emit = defineEmits(['add-todo']);
const todo = ref('');
const addTodoHandler = () => {
  if (todo.value.length >= 3) {
    emit('add-todo', todo.value);
    todo.value = '';
  }
  ;
}
</script>