import {createRouter, createWebHistory} from 'vue-router';
import HomePage from '../pages/HomePage.vue';
import authRotes from './auth';
import boardRotes from './board';
import travelRoutes from './travel';
import galleryRoutes from './gallery';
import NotFoundPage from '../pages/NotFound.vue';

const router = createRouter({
        history: createWebHistory(import.meta.env.BASE_URL),
        routes: [
            {
                path: '/',
                name: 'home',
                component: HomePage,
            },
            ...authRotes,
            ...boardRotes,
            ...travelRoutes,
            ...galleryRoutes,
            {
                // 정규식을 사용하여 어떤 문자열이든 매치시킵니다.
                path: '/:pathMatch(.*)*',
                name: 'NotFound',
                component: NotFoundPage
            }
        ],

    }
);

export default router;
