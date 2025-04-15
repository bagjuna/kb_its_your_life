import { createRouter, createWebHistory } from 'vue-router'
import Home from '@/pages/Home.vue'
import AddTodo from '@/pages/AddTodo.vue'
import TodoList from '@/pages/TodoList.vue'
import About from '@/pages/About.vue'

import EditTodo from '@/pages/EditTodo.vue'
import NotFound from '@/pages/NotFound.vue'
const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: Home,
    },
    {
      path: '/about',
      name: 'about',
      component: About,
    },
    {
      path: '/todos',
      name: 'todos',
      component: TodoList,
    },
    {
      path: '/todos/add',
      name: 'add',
      component: AddTodo,
    },
    {
      path: '/todos/edit/:id',
      name: 'edit',
      component: EditTodo,
    },
    {
      path: '/:paths(.*)*',
      component: NotFound,
    },
  ],
})

export default router
