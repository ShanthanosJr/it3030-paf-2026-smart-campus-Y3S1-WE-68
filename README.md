# 🏫 Smart Campus Operations Hub

An integrated enterprise-grade solution for managing campus resources, maintenance workflows, and student engagement. 

This project was developed as part of the **IT3030 PAF Assignment 2026**.

## 🚀 Features

- **🔐 Secure Authentication**: Integrated Google OAuth 2.0 for seamless and secure access.
- **🛡️ Role-Based Access Control (RBAC)**: Defined workflows for **Users**, **Technicians**, and **Admins**.
- **📅 Resource Booking**: Management of campus facilities with automated approval/rejection workflows.
- **🛠️ Incident Ticketing**: Maintenance system with technician assignment and status tracking (Open, In Progress, Resolved).
- **🔔 Real-time Notifications**: In-app alerts for booking status, ticket updates, and comments.
- **📊 Admin Portal**: Comprehensive management for users, resources, and campus-wide analytics.
- **📱 QR Integration**: QR code system for quick resource identification and check-ins.

---

## 🛠️ Tech Stack

### Backend
- **Java 21** with **Spring Boot 4.x**
- **MongoDB Atlas** (Cloud Database)
- **Spring Security** (OAuth2/RBAC)
- **Lombok** & **Maven**

### Frontend
- **React 18** (Vite)
- **Tailwind CSS**
- **Framer Motion** (Animations)
- **Recharts** (Data Visualization)
- **Lucide React** (Icons)

---

## ⚙️ Getting Started

### Prerequisites
- **JDK 21** or higher
- **Node.js** (v18+)
- **npm** or **yarn**

### 1. Clone the repository
```bash
git clone https://github.com/ShanthanosJr/Smart_Campus.git
cd Smart_Campus
```

### 2. Configure Environment Variables

#### Backend (`/smart-campus-backend/.env`)
Create a `.env` file from the provided `.env.example`:
```env
MONGODB_URI=your_mongodb_uri
GOOGLE_CLIENT_ID=your_google_client_id
GOOGLE_CLIENT_SECRET=your_google_client_secret
```

#### Frontend (`/smart-campus-frontend/.env`)
Create a `.env` file:
```env
VITE_API_BASE_URL=http://localhost:8080
VITE_GOOGLE_CLIENT_ID=your_google_client_id
```

### 3. Run the Application

#### Start Backend
```bash
cd smart-campus-backend
./mvnw spring-boot:run
```

#### Start Frontend
```bash
cd smart-campus-frontend
npm install
npm run dev
```

---

## 📜 License
This project is licensed under the **MIT License** - see the [LICENSE](LICENSE) file for details.

## 👥 Team
Developed by **Kavishka_r** and team for the Smart Campus initiative.
