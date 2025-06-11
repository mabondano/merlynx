# Melynx

> **Domain-specific programming language for pipelines, signals, data engineering, and AI workflows**

---

Melynx is a modern, domain-specific language (DSL) designed to express, compose, and automate pipelines in scientific signal processing, data engineering, and artificial intelligence.  
It is the scripting and orchestration backbone for the MerLab ecosystem—integrating seamlessly with [MerLabCore](https://github.com/your-org/merlabcore), [StackFlow](https://github.com/your-org/stackflow), and [FlowScope](https://github.com/your-org/flowscope).

---

## ✨ **Key Features (Planned & In Progress)**

- **Pipeline Definition:**  
  Simple, expressive syntax for building and managing complex data and signal processing pipelines.

- **Signal & Data Processing:**  
  Built-in primitives for temporal signals, time series, batch and streaming data, and domain-specific operations.

- **AI & Machine Learning Integration:**  
  Native constructs for defining, training, and deploying ML/AI workflows (roadmap).

- **Composable & Modular:**  
  Functions, operators, and macros for reusable workflow components.

- **Orchestration & Automation:**  
  Control of execution, scheduling, monitoring, and error handling within pipelines.

- **Seamless Integration:**  
  Designed for deep interoperability with MerLabCore (processing), StackFlow (backend), and FlowScope (visualization).

---

## 🛠️ **Status**

Melynx is in its early development phase.  
Initial releases will focus on pipeline orchestration and signal/data manipulation, with gradual expansion towards full AI programming capabilities.

---

## 🚀 **Vision**

Melynx aims to become the preferred language for scientists, engineers, and data professionals seeking to bridge domain knowledge with automation, intelligence, and reproducibility—making advanced signal, data, and AI workflows accessible and auditable.

---

## 📄 **License**

This project is licensed under the MIT License.

---

## 👩‍💻 **Get Involved**

We welcome feedback, feature suggestions, and early contributors!  
For discussion and updates, visit our [project page](https://github.com/your-org/melynx).

---
# Merlynix Modular Architecture

Merlynix — A modular language for AI, Signal Processing, and LLM Integration

## Project Structure

```plaintext

Merlynix (Lenguaje modular para IA + DSP + LLM)

├── merlynix-core
│   ├── Parser del DSL
│   ├── Manejador de pipeline y ejecución
│   └── CLI del lenguaje (.mlnx)
│
├── merlynix-rules
│   └── Motor de reglas basado en Drools
│
├── merlynix-datalog
│   └── Submotor lógico inspirado en Datalog (consultas, relaciones)
│
├── merlynix-logic (opcional)
│   └── Conector JPL hacia SWI-Prolog para razonamiento simbólico
│
├── merlynix-ml
│   ├── Capa de aprendizaje automático
│   ├── Modelos ONNX, DL4J, o puente hacia Python
│   └── Lógica para decisiones IA
│
├── merlynix-signals
│   └── Procesamiento de señales, operaciones DSP, pila RPN
│
└── merlynix-llm
    └── Wrapper para modelos LLaMA.cpp, gguf, o vía HTTP local

Aplicaciones:
- MerLabStudio → usa merlynix-signals + core + ml
- StackFlowServer → usa merlynix-rules + datalog + core

```

## Integrated Applications

- **MerLabStudio**
  - Uses: `merlynix-signals`, `merlynix-core`, `merlynix-ml`

- **StackFlowServer**
  - Uses: `merlynix-rules`, `merlynix-datalog`, `merlynix-core`

---
