import { Router } from "express";
import { getEmployees, createEmployee, updateEmployee, deleteEmployee, getEmployee } from '../controllers/employees.controller.js'

const router = Router()

// GET ALL
router.get('/employees', getEmployees)

// GET BY ID
router.get('/employees/:id', getEmployee)

// POST
router.post('/employees', createEmployee)

// PUT
// router.put('/employees/:id', updateEmployee)

// PATCH
router.patch('/employees/:id', updateEmployee)

// DELETE
router.delete('/employees/:id', deleteEmployee)

export default router