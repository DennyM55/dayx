const API_URL = "http://localhost:8080";

export async function getTodayPlan() {
    const response = await fetch(`${API_URL}/api/today`);

    if (!response.ok) {
        throw new Error("Could not load today's plan");
    }

    return response.json();
}