<template>
  <div>
    <h1>About</h1>
    요청 경로 : {{currentRoute.path}}
  </div>
</template>
<script setup>
import { computed } from 'vue'
import { useRoute, useRouter } from 'vue-router'
const currentRoute = useRoute();
</script>


<style lang="scss" scoped>

</style>