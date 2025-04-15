import { createRouter, createWebHistory } from 'vue-router'
import Home from '@/views/Home.vue'
import About from '@/views/About.vue'

import TodoList from '@/views/TodoList.vue'
import AddTodo from '@/views/AddTodo.vue'
import EditTodo from '@/views/EditTodo.vue'


import NotFound from '@/views/NotFound.vue'
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
