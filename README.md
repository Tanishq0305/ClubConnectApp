
# 🎓 ClubConnectApp

**Centralized Android app for managing college clubs**: announcements, events, hiring, discussions, and more — designed to bring student clubs together in one seamless mobile experience.

## 📱 Overview

ClubConnect is an Android application crafted for college clubs to:

* Broadcast **announcements** and news to members
* Manage **upcoming events** with RSVPs and reminders
* Post **job/internship opportunities** or **club hiring notices**
* Facilitate **discussion forums** or idea-sharing boards
* Let members **customize notifications**, **search events**, and engage via intuitive UI

Built with modern Android architecture, this app offers a scalable and modular codebase ready for expansion and customization.

## 🧩 Features

### ✅ Core Modules

* **Authentication** – Email and password sign-in with Firebase (or your backend)
* **Feed** – Real‑time stream of announcements using RecyclerView & ViewModel
* **Events** – Create, view, RSVP, and set reminders
* **Hiring Board** – Post and browse club/internship listings
* **Forums** – Topic-based threads, comments, and search
* **Profile & Settings** – Notification preferences, club membership details, account settings

### 🔧 Architecture

* **MVVM pattern** using `ViewModel`, `LiveData`/`Flow`, and **Repository layer**
* **Navigation Component** for smooth in-app navigation
* **Room** for offline caching (e.g., downloaded events/posts)
* **Retrofit + Coroutine** for clean async network operations
* **Dependency Injection** (e.g., Dagger/Hilt or Koin) for modularity and testability
* **Material Design** adherent for a clean, modern look


## ✅ What’s Completed

* Fully functioning UI for feed, events, hiring board, forums
* Notification preferences and settings
* Clean, maintainable code with MVVM + DI + coroutines
* Role-based access: Admin vs member privileges
* Media attachments: Photos/documents in posts and events
* Group-based clubs: Multi-club support & discovery
* Editing capability: Update posts/events on the fly
* Push notifications: Reminders and alerts


