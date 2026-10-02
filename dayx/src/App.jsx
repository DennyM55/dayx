import "./App.css";

function App() {
  const plan = [
    { icon: "💧", title: "Hydrate", tip: "Keep water nearby and hydrate regularly." },
    { icon: "🥗", title: "Eat Well", tip: "Add some fruit or vegetables to a meal." },
    { icon: "🚶", title: "Move", tip: "Take a short walk or movement break." },
    { icon: "🧘", title: "Pause", tip: "Take a few quiet minutes away from screens." },
    { icon: "🌤️", title: "Step Outside", tip: "Spend a little time outdoors if practical." },
    { icon: "🌙", title: "Wind Down", tip: "Give yourself some screen-free time before bed." },
  ];

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