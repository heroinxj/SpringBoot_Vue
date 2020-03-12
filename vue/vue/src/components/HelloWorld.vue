<template>
  <div class="hello">
    <h1>{{ msg }}</h1>

    <h1>Hello World</h1>
    <h2>姓名：{{student.name}}</h2>
    <h2>年龄：{{student.age}}</h2>
    <button @click="query"> 查询 </button>

  </div>
</template>

<script>
  export default {
    name: 'HelloWorld',
    data () {
      return {
        msg: 'Welcome to Your Vue.js App',
        student: {
          name:"",
          age:""
        },
      }
    },

    methods: {
      query:function(){

        var _this = this;
        this.$axios.get('/query?sid='+1).then(function(response) {
          var data   = response.data;
          console.log(data);
          _this.student.name = data.name;
          _this.student.age = data.age;
        })
      },

    },


  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  h1, h2 {
    font-weight: normal;
  }
  ul {
    list-style-type: none;
    padding: 0;
  }
  li {
    display: inline-block;
    margin: 0 10px;
  }
  a {
    color: #42b983;
  }
</style>
