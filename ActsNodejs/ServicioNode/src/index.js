import express from 'express'
import employeesRoutes from './routes/employees.routes.js'
import indexRoutes from './routes/index.routes.js'

const app = express()

app.use(express.json())

app.use('/api', indexRoutes)
app.use('/api', employeesRoutes)

app.use((req, res, next) => {
    res.status(404).json({
        message: 'End point not found'
    })
})

app.listen(process.env.PORT, () => {
    console.log("Server running on port 3000");
});