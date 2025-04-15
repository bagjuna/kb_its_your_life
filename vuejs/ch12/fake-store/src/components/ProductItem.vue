<script setup>
import { RouterLink } from 'vue-router'
const props = defineProps({ product: { type: Object, required: true } })
console.log(props.product)
</script>
<template>
  <div class="my-3">
    <img :src="product.image" width="30" height="30" class="me-2" />
    <RouterLink :to="{ name: 'product/id', params: { id: product.id } }">
      {{ product.title }}
    </RouterLink>
  </div>
</template>
<style scoped>
a {
  text-decoration: none;
}
</style>
