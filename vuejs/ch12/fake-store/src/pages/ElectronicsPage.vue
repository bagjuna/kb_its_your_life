<script setup>
import * as api from '@/api/product.js'
import ProductAddButton from '@/components/product/ProductAddButton.vue'
import ProductList from '@/components/product/ProductList.vue'
import { reactive } from 'vue'
const category = 'electronics'
const state = reactive({ products: [] })
const load = async () => {
  state.products = await api.get('/category/' + category)
  console.log(state.products)
}
load()
</script>
<template>
  <h1 class="mb-5"><i class="fa-solid fa-tv"></i> 가전</h1>
  <ProductList :products="state.products" />
  <ProductAddButton :category="category" />
</template>
