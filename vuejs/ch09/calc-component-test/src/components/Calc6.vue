<template>
  <div>
    X : <input type="text" v-model.number="state.x"/>
    <br/>
    결과 : {{ state.result }}
  </div>
</template>

<script>
import {reactive, watch} from 'vue';

export default {
  name: 'Calc6',
  setup() {
    const state = reactive({x: 10, result: 30});
    watch(
        () => state.x,
        (current, old) => {
          console.log(current + " " + old);
          state.result = current * 2;
        }
    )
    return {state};
  },
};
</script>
