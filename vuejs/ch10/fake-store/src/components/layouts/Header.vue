<template>
  <nav class="navbar navbar-expand-md bg-dark navbar-dark mt-2">
    <button class="navbar-toggler" type="button" @click="changeIsNavShow">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div :class="navClass">
      <ul class="navbar-nav">
        <li class="nav-item">
          <router-link class="nav-link" to="/">
            <font-awesome-icon :icon="['fas', 'house']" />
            Fake Store</router-link>
        </li>
        <li class="nav-item">
          <router-link class="nav-link" to="/electronics">
            <font-awesome-icon :icon="['fas', 'tv']" />

            가전</router-link>
        </li>
        <li class="nav-item">
          <router-link class="nav-link" to="/jewelery ">
            <font-awesome-icon :icon="['fas', 'gem']"/>
            주얼리
          </router-link>
        </li>
        <li class="nav-item">
          <router-link class="nav-link" to="/mensclothing ">
            <font-awesome-icon :icon="['fas', 'male']"/>
            남성의류
          </router-link>
        </li>
        <li class="nav-item">
          <router-link class="nav-link" to="/mensclothing ">
            <font-awesome-icon :icon="['fas', 'female']"/>
            여성의류
          </router-link>
        </li>
      </ul>
    </div>
  </nav>
</template>


<script>
import { reactive, computed } from 'vue';
export default {
  setup() {
    const state = reactive({ isNavShow: false });
    const navClass = computed(() =>
        state.isNavShow
            ? 'collapse navbar-collapse show'
            : 'collapse navbar-collapse'
    );
    const changeIsNavShow = () => { state.isNavShow = !state.isNavShow; };
    return { state, changeIsNavShow, navClass };
  },
};
</script>