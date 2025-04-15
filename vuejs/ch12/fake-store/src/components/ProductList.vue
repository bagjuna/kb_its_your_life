<script setup>
import ProductItem from './ProductItem.vue'
const props = defineProps({
  products: { type: Array, required: true },
})
</script>
<template>
  <div>
    <ProductItem v-for="product in products" :key="product.id" :product="product" />
  </div>
</template>
