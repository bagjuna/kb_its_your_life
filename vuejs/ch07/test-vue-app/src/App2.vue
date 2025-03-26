<script>
import CheckboxItem from './components/CheckboxItem2.vue';

export default {
  name: 'App',
  components: { CheckboxItem },
  data() {
    return {
      idols: [
        { id: 1, name: 'bts', checked: true },
        { id: 2, name: '봉준호', checked: false },
        { id: 3, name: '손흥민', checked: true },
        { id: 4, name: 'JPark', checked: false },
      ],
    };
  },
};
</script>

<template>
  <h2>App 컴포넌트</h2>
  <ul>
    <CheckboxItem v-for="idol in idols" :key="idol.key" :idol="idol" />
  </ul>
</template>

<style scoped>
header {
  line-height: 1.5;
}

.logo {
  display: block;
  margin: 0 auto 2rem;
}

@media (min-width: 1024px) {
  header {
    display: flex;
    place-items: center;
    padding-right: calc(var(--section-gap) / 2);
  }

  .logo {
    margin: 0 2rem 0 0;
  }

  header .wrapper {
    display: flex;
    place-items: flex-start;
    flex-wrap: wrap;
  }
}
</style>
