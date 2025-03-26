<template>
  <li>{{id}} <input type="checkbox" :checked="checked" />{{ name }}</li>
</template>

<script>
export default {
  name: 'CheckboxItem',
  props: ['id', 'name', 'checked'],
  data() {
    return {};
  },
};
</script>

<style></style>
