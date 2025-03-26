<template>
  <li class="list-group-item">

  <span class="pointer">
    {{ todoItem.todo }}
</span>
    <span class="float-end badge bg-secondary pointer">
      삭제
    </span>
  </li>
</template>


<script>

export default {
  name: 'TodoListItem',
  props: {
    todoItem: {type: Object, required: true},
  },
}
</script>