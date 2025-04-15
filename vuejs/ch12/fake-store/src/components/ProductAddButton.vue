<script setup>
import { RouterLink } from 'vue-router'
const props = defineProps({
  category: { type: String, required: true },
})
</script>
<template>
  <div class="my-3 text-end me-5">
    <RouterLink :to="{ name: 'product/write', query: { category } }" class="btn btn-primary">
      <i class="fa-solid fa-plus"></i> 상품 등록
    </RouterLink>
  </div>
</template>
