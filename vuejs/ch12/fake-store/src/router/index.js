import HomeView from '@/pages/HomeView.vue'
import { createRouter, createWebHistory } from 'vue-router'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    { path: '/', name: 'home', component: HomeView },
    {
      path: '/electronics',
      name: 'electronics',
      component: () => import('../pages/ElectronicsPage.vue'),
    },
    {
      path: '/jewelery',
      name: 'jewelery',
      component: () => import('../pages/JeweleryPage.vue'),
    },
    {
      path: '/mensclothing',
      name: "men's clothing",
      component: () => import('../pages/MensClothingPage.vue'),
    },
    {
      path: '/womensclothing',
      name: "women's clothing",
      component: () => import('../pages/WomensClothingPage.vue'),
      },
  ],
})

export default router
