<script>
// import CheckBox1 from './components/CheckBox1.vue';
// import Child1 from './components/Child1.vue';
// import Child2 from './components/Child2.vue';
// import Child3 from './components/Child3.vue';
// import NamedSlotTest from './components/NamedSlotTest.vue';
// import NoSlotTest from './components/NoSlotTest.vue';
import SlotTest from './components/SlotTest.vue';

export default {
  name: 'App',
  components: { SlotTest },
};
</script>

<template>
  <div>
    <SlotTest />
  </div>
</template>
