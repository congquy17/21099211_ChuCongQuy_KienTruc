const express = require('express');
const os = require('os');

const app = express();
const PORT = 3000;

// Fake database
const products = [
  { id: 1, name: "iPhone 15", price: 25000000 },
  { id: 2, name: "Samsung S24", price: 22000000 },
  { id: 3, name: "Xiaomi 14", price: 15000000 },
  { id: 4, name: "MacBook Air M3", price: 32000000 }
];

// API lấy danh sách sản phẩm
app.get('/products', (req, res) => {
  res.json({
    server: os.hostname(),   // Cho biết request đang vào server nào
    data: products
  });
});

app.listen(PORT, () => {
  console.log(`Server running on port ${PORT}`);
});
