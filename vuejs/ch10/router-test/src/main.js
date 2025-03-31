import { createApp } from 'vue'
import 'bootstrap/dist/css/bootstrap.css'
import App from './App.vue'
import router from './router'

import {library} from '@fortawesome/fontawesome-svg-core';


import {
    faUser,
    faEnvelope,
    faHouse,
    faRightFromBracket,
    faLock,
    faPen,
    faCheck, faRotateLeft, faList,
    faHome,
    faTv,
    faRightToBracket,
    faGem, faRing, faMale, faFemale
} from '@fortawesome/free-solid-svg-icons';

import {FontAwesomeIcon} from "@fortawesome/vue-fontawesome";

library.add(faRightToBracket, faTv,faHome,faGem,faRing,faMale,faFemale);


const app = createApp(App)

app.use(router)

app.component('font-awesome-icon', FontAwesomeIcon).mount('#app')
