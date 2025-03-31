import {createRouter, createWebHistory} from 'vue-router'
import ElectronicsPage from "@/pages/ElectronicsPage.vue";
import HomePage from "@/pages/HomePage.vue";

const router = createRouter({
    history: createWebHistory(import.meta.env.BASE_URL),
    routes: [
        {
            path: '/',
            name: 'home',
            component: HomePage,
        },
        {
            path: '/electronics',
            name: 'electronics',
            component: ElectronicsPage
        }
    ],
})

export default router
