<template>
  <div class="problems-page">
    <nav-bar></nav-bar>
    <div class="content">
      <div class="left-column">
        <div class="header">
          <h2>题目列表</h2>
          <div class="filter-controls">
            <label for="difficulty">难度：</label>
            <select id="difficulty" class="difficulty-select">
              <option>全部</option>
              <option>简单</option>
              <option>中等</option>
              <option>困难</option>
            </select>
            <input type="text" class="search-box" placeholder="关键词">
            <button class="reset-button">重置</button>
          </div>
        </div>
        <div class="table-container">
          <table class="topics-table">
            <thead>
              <tr>
                <th>编号</th>
                <th>标题</th>
                <th>难度</th>
                <th>提交总数</th>
                <th>通过率</th>
                <th>标签</th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <td>0000</td>
                <td>
                  <router-link to="/problems/detail/0000" class="problem-title">A + B Problem</router-link>
                </td>
                <td><span class="tag easy">简单</span></td>
                <td>77</td>
                <td>68.83%</td>
                <td>
                  <div class="label-container">
                    <button class="tag-button">基础</button>
                  </div>
                </td>
              </tr>
              <tr>
                <td>contest_4_A</td>
                <td>
                  <router-link to="/problems/detail/contest_4_A" class="problem-title">打乒乓球</router-link>
                </td>
                <td><span class="tag easy">简单</span></td>
                <td>36</td>
                <td>19.44%</td>
                <td>
                  <div class="label-container">
                    <button class="tag-button">基础</button>
                    <button class="tag-button">信息学竞赛</button>
                  </div>
                </td>
              </tr>
            </tbody>
          </table>
        </div>
        <div class="pagination">
          <button class="prev-button">&lt;</button>
          <button class="page-button active">1</button>
          <button class="page-button">2</button>
          <button class="page-button">3</button>
          <button class="page-button">4</button>
          <button class="next-button">&gt;</button>
        </div>
      </div>
      <div class="right-column">
        <h3>标签</h3>
        <div class="tag-buttons">
          <button class="tag-button">基础</button>
          <button class="tag-button">信息学竞赛</button>
          <button class="tag-button">树</button>
        </div>
        <button class="pick-button">选择</button>
      </div>
    </div>
  </div>
</template>

<script>
import NavBar from '@/components/NavBar.vue'

export default {
  name: 'ProblemsPage',
  components: {
    NavBar
  }
}
</script>

<style scoped>
.problems-page {
  display: flex;
  flex-direction: column;
  min-height: 100vh;
  background-color: #f5f5f5; /* 浅灰色背景 */
  border-radius: 15px; /* 圆角 */
  overflow: hidden; /* 确保圆角效果 */
}

.content {
  display: flex;
  padding: 20px;
}

.left-column {
  flex: 2; /* 左边部分占据较大空间 */
  display: flex;
  flex-direction: column;
  margin-right: 20px;
}

.header {
  display: flex;
  justify-content: space-between; /* 使标题和按钮分开 */
  align-items: center; /* 垂直居中 */
}

.filter-controls {
  display: flex;
  align-items: center;
}

.difficulty-select {
  margin-right: 10px;
  padding: 10px; /* 加大内边距 */
  font-size: 16px; /* 加大字体 */
}

.search-box {
  margin-right: 10px;
  padding: 10px; /* 加大内边距 */
  font-size: 16px; /* 加大字体 */
  border-radius: 15px; /* 圆角 */
}

.reset-button {
  background-color: #f0f0f0;
  border: none;
  padding: 10px 15px; /* 加大内边距 */
  border-radius: 5px;
  cursor: pointer;
  font-size: 16px; /* 加大字体 */
}

.table-container {
  background-color: #ffffff; /* 白色背景 */
  padding: 20px; /* 内边距 */
  border-radius: 15px; /* 圆角 */
  box-shadow: 0 4px 12px rgba(0, 0, 0, 0.2); /* 增加阴影效果 */
  margin-top: 20px; /* 与其他组件的间距 */
}

.topics-table {
  width: 100%;
  border-collapse: collapse;
}

.topics-table th,
.topics-table td {
  padding: 10px;
  text-align: left;
}

.topics-table th {
  background-color: #00796b;
  color: white;
}

.topics-table .tag {
  background-color: green;
  color: white;
  padding: 3px 6px;
  border-radius: 3px;
}

.topics-table .label-container {
  background-color: #ffffff; /* 白色背景 */
  padding: 5px; /* 内边距 */
  border-radius: 15px; /* 圆角 */
  display: inline-flex; /* 使标签在一行内显示 */
}

.topics-table .label {
  background-color: #e0e0e0;
  padding: 3px 6px;
  border-radius: 15px; /* 椭圆形 */
  margin-right: 5px;
}

.pagination {
  display: flex;
  justify-content: center;
  margin-top: 20px;
}

.page-button,
.prev-button,
.next-button {
  background-color: #00796b;
  color: white;
  border: none;
  padding: 5px 10px;
  margin: 0 5px;
  border-radius: 5px;
  cursor: pointer;
}

.page-button.active {
  background-color: #004d40; /* 当前页的颜色 */
}

.page-button:hover,
.prev-button:hover,
.next-button:hover {
  background-color: #004d40; /* 悬停时的颜色 */
}

.right-column {
  flex: 1; /* 右侧标签选择区域 */
  padding: 20px;
  background-color: #ffffff; /* 白色背景 */
  border-radius: 15px; /* 圆角 */
  box-shadow: 0 4px 12px rgba(0, 0, 0, 0.2); /* 增加阴影效果 */
}

.tag-buttons {
  display: flex;
  flex-direction: column;
  margin-bottom: 20px;
}

.tag-button {
  background-color: #e0e0e0;
  border: none;
  padding: 5px 10px;
  border-radius: 10px; /* 圆角矩形 */
  margin: 5px 0;
  cursor: pointer;
  width: auto; /* 自动宽度 */
  height: auto; /* 自动高度 */
  display: flex;
  align-items: center;
  justify-content: center;
}

.pick-button {
  background-color: #00796b;
  color: white;
  border: none;
  padding: 10px 15px;
  border-radius: 5px;
  cursor: pointer;
}
</style> 