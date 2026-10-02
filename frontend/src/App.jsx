import { useEffect, useState } from "react";
import "./App.css";
import { getTodayPlan } from "./services/planApi";

function App() {
    const [plan, setPlan] = useState([]);
    const [error, setError] = useState("");

    useEffect(() => {
        getTodayPlan()
            .then((data) => setPlan(data))
            .catch(() => setError("Could not load today's plan."));
    }, []);

    return (
        <main>
            <header>
                <h1>dayx.</h1>
                <p className="tagline">Make today count.</p>
            </header>

            <section className="hero">
                <p className="date">
                    {new Date().toLocaleDateString("en-US", {
                        weekday: "long",
                        month: "long",
                        day: "numeric",
                    })}
                </p>

                <h2>Today's little wins</h2>
                <p>Simple ideas for a healthier day.</p>
            </section>

            {error && <p>{error}</p>}

            <section className="plan">
                {plan.map((item) => (
                    <article className="card" key={item.title}>
                        <span className="icon">{item.icon}</span>

                        <div>
                            <h3>{item.title}</h3>
                            <p>{item.tip}</p>
                        </div>
                    </article>
                ))}
            </section>

            <footer>
                <p>Small things. Every day.</p>
                <small>
                    General wellness information only. Not medical or dietary advice.
                </small>
            </footer>
        </main>
    );
}

export default App;