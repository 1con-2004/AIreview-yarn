const express = require('express');
const cors = require('cors');
const loginRouter = require('./api/login');

const app = express();

// 配置 CORS
app.use(cors({
  origin: 'http://localhost:8080', // 替换为你的前端地址
  credentials: true
}));

// 解析 JSON 请求体
app.use(express.json());

// 使用登录路由
app.use('/api', loginRouter);

// 启动服务器
const PORT = process.env.PORT || 3000;
app.listen(PORT, () => {
  console.log(`Server is running on port ${PORT}`);
}); 