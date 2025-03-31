import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import Members from "@/pages/Members.vue";
import About from "@/pages/About.vue";
import Home from "@/pages/Home.vue";
import Videos from "@/pages/Videos.vue";
import MemberInfo from '@/pages/MemberInfo.vue';
import NotFound from "@/pages/NotFound.vue";

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    { path: '/', component: Home },
    { path: '/about', component: About },
    { path: '/members', component: Members },
    { path: '/members/:id', component: MemberInfo },
    { path: '/videos', component: Videos },
    { path: '/:paths(.*)*', name: 'NotFound', component: NotFound },
  ],
})


export default router
