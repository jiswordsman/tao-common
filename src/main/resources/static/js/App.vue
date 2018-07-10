<script>
    // 定义组件
    var myTemplate = {
        // Vue组件必须只有唯一的根标签，即下面这个div不能有兄弟节点
        template: '<div>我的第一个组件</div>',
        // template:'<div>{{mess}}<button @click="btn_click(456)">点我</button></div>',
        data: function () {
            return {
                mess: "我是一个组件",
            }
        },
        methods: {
            btn_click: function (n) {
                console.log(n);
            }
        }
    }
    Vue.component("my-component", myTemplate);
</script>

<style scoped>

</style>